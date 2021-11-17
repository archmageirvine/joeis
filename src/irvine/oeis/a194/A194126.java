package irvine.oeis.a194;

import irvine.math.z.Z;
import irvine.oeis.a088.A088207;

/**
 * A194126 -1+A088207.
 * @author Georg Fischer
 */
public class A194126 extends A088207 {

  /** Construct the sequence. */
  public A194126() {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
