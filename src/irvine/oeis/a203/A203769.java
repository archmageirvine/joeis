package irvine.oeis.a203;

import irvine.math.z.Z;

/**
 * A203769 a(n) = (A203768(n+2) - 1)/2.
 * @author Georg Fischer
 */
public class A203769 extends A203768 {

  /** Construct the sequence. */
  public A203769() {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1).divide2();
  }
}
