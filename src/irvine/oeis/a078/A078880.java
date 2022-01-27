package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;

/**
 * A078880 The sequence starting with 2 that equals its own run length sequence.
 * a(n) = k(n+1), where k=A000002, the Kolakoski sequence.
 * @author Georg Fischer
 */
public class A078880 extends A000002 {

  /** Construct the sequence. */
  public A078880() {
    super.next();
  }

  @Override
  public Z next() {
    return super.next();
  }
}
