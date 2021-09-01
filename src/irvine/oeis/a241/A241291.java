package irvine.oeis.a241;
// manually at 2021-07-20

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;
import irvine.util.string.StringUtils;

/**
 * A241291 Decimal expansion of 2^(2^(2^(2^(2^2)))) = 2^^6.
 * Usual <code>DecimalExpansion</code>, but throws <code>UnsupportedOperationException</code>
 * when the limit of number of terms {@link #NBRDGT} is reached.
 * @author Georg Fischer
 */
public class A241291 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A241291() {
    this(2, Z.ONE.shiftLeft(65536));
  }

  /** 
   * Generic constructor with parameters
   * @param base base of power tower
   * @param expr integer expression for the power tower with one level decreased
   */
  public A241291(final int base, final Z expr) {
    super(getCR(base, expr));
  }

  protected static final int NBRDGT = 128; // implementation limit
  protected int mTermNo = 0;
  private static final CR INV_LOG10 = CR.TEN.log().inverse();

  private static CR log10(final CR x) {
    return x.log().multiply(INV_LOG10);
  }

  /**
   * Compute some leading digits of a power tower
   * @param base base of power tower
   * @param expr integer expression for the power tower with one level decreased
   * The formula is taken from the Mathematica in A241295:
   * <code>
   * nbrdgt = 105; 
   * f[base_, exp_] := RealDigits[ 
   *   10^FractionalPart[ 
   *     N[exp*Log10[base], nbrdgt + Floor[Log10[exp]] + 2]
   *   ]
   *   , 10, nbrdgt][[1]]; 
   * f[ 6, 6^6^6]
   * </code>
   * @return or real value
   */
  protected static CR getCR(final int base, final Z expr) {
    final CR crExpr = CR.valueOf(expr);
    StringUtils.message("expr=" + crExpr);
    final CR l = log10(CR.valueOf(base));
    StringUtils.message("l=" + l);

    final CR b = crExpr.divide(CR.TEN.pow(expr.toString().length() - 1));
    StringUtils.message("b=" + b);
    final CR c = b.multiply(l);
    StringUtils.message("c=" + c);
    StringUtils.message("10^(cl)=" + CR.TEN.pow(c.multiply(l)));

    final int precision = NBRDGT + log10(crExpr).floor().intValueExact() + 2;
    StringUtils.message("precision (digits?) =" + precision);
    final CR ll = CR.valueOf(new Q(l.getApprox(-4 * precision), Z.ONE.shiftLeft(4 * precision)));
    StringUtils.message("ll=" + ll);
    final CR t = ll.multiply(crExpr);
    StringUtils.message("t=" + t);
    final CR frac = t.frac();
    StringUtils.message("frac=" + frac);
    final CR res = CR.TEN.pow(frac);
    StringUtils.message("res=" + res);
    return res;
  }

  @Override
  public Z next() {
    ++mTermNo;
    if (mTermNo < NBRDGT) {
      return super.next();
    } else {
      throw new UnsupportedOperationException("implementation limited to " + NBRDGT + " terms");
    }
  }
}
