package irvine.oeis.a241;
// manually at 2021-07-20

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A241291 Decimal expansion of 2^(2^(2^(2^(2^2)))) = 2^^6.
 * Usual DecimalExpansion, but throws <code>UnsupportedOperationException</code> 
 * when the limit of number of terms {@link #NBRDGT} is reached.
 * @author Georg Fischer
 */
public class A241291 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence */
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

  /**
   * Compute some leading digits of a power tower
   * @param base base of power tower
   * @param expr integer expression for the power tower with one level decreased
   * The formula is taken from the Mathematica in A241295:
   * nbrdgt = 105; 
   * f[base_, exp_] := RealDigits[ 
   *   10^FractionalPart[ 
   *     N[exp*Log10[base], nbrdgt + Floor[Log10[exp]] + 2]
   *   ]
   *   , 10, nbrdgt][[1]]; 
   * f[ 6, 6^6^6]
   * @return or real value
   */
  protected static CR getCR(final int base, final Z expr) {
    final CR crExpr = CR.valueOf(expr);
    return CR.TEN.pow((CR.valueOf(base).log().divide(CR.TEN.log()).multiply(crExpr)).frac());
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
