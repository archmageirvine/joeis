package irvine.oeis.a291;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A291789 Trajectory of 270 under repeated application of k -&gt; (phi(k)+sigma(k))/2.
 * @author Sean A. Irvine
 */
public class A291789 extends AbstractSequence {

  /** Construct the sequence. */
  public A291789() {
    super(0);
  }

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private Z mN = null;

  protected long start() {
    return 270;
  }

  @Override
  public Z next() {
    final Z prev = mN;
    if (mN == null) {
      mN = Z.valueOf(start());
    } else {
      final FactorSequence fs = Jaguar.factor(mN);
      final Z t = fs.phi().add(fs.sigma());
      if (t.isOdd()) {
        throw new UnsupportedOperationException("Unexpected odd value " + t);
      }
      mN = t.divide2();
      if (mVerbose) {
        System.out.println("# " + new Q(mN, prev).doubleValue() + " " + FactorSequence.toString(fs) + " " + fs.getExponent(Z.TWO) + " " + fs.getExponent(Z.THREE));
      }
    }
    return mN;
  }

  /**
   * Run the sequence with a particular start value.
   * @param args the start value
   */
  public static void main(final String[] args) {
    if (args.length == 0) {
      System.out.println("Usage: irvine.oeis.a291.A291789 start-value");
      return;
    }
    final A291789 seq = new A291789() {
      @Override
      protected long start() {
        return Long.parseLong(args[0]);
      }
    };
    Z t;
    while ((t = seq.next()) != null) {
      System.out.println(t);
    }
  }
}
