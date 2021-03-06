package irvine.oeis.a342;
// Generated by gen_seq4.pl bisect at 2021-07-05 22:21
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a001.A001951;


/**
 * A342281 A bisection of A001951: a(n) = A001951(2*n+1).
 * @author Georg Fischer
 */
public class A342281 extends A001951 {

  /** Construct the sequence. */
  public A342281() {
    super.next();
  }
  
  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    return result;
  }
}
