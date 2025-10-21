package irvine.oeis.a389;

import irvine.math.z.Z;

/**
 * A389723 a(n) is the greatest prime &gt; a(n-1) obtained by inserting a single digit anywhere in its string of digits (including at the beginning or end), starting with a(1) = 3.
 * @author Sean A. Irvine
 */
public class A389723 extends A389721 {

  /** Construct the sequence. */
  public A389723() {
    super(Z.THREE);
  }
}
