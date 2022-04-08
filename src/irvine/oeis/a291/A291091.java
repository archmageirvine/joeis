package irvine.oeis.a291;

import irvine.math.z.Z;
import irvine.oeis.a214.A214938;

/**
 * A291091 a(n) = A214938(2n+1).
 * @author Georg Fischer
 */
public class A291091 extends A214938 {

  /** Construct the sequence. */
  public A291091() {
  }

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}
