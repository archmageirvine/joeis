package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007497 a(1) = 2, a(n) = sigma(a(n-1)).
 * @author Sean A. Irvine
 */
public class A007497 implements Sequence {

  private Z mA = null;

  protected Z start() {
    return Z.TWO;
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = start();
    } else {
      mA = Jaguar.factor(mA).sigma();
    }
    return mA;
  }

  /**
   * Produce this sequence from a given value onwards.
   * @param args value
   */
  public static void main(final String[] args) {
    final A007497 mSeq = new A007497();
    mSeq.mA = new Z(args[0]);
    while (true) {
      System.out.println(mSeq.next());
    }
  }
}

