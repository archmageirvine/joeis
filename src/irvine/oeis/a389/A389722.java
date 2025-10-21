package irvine.oeis.a389;

import irvine.math.z.Z;

/**
 * A389722 a(n) is the greatest prime &gt; a(n-1) obtained by inserting a single digit anywhere in its string of digits (including at the beginning or end), starting with a(1) = 2.
 * @author Sean A. Irvine
 */
public class A389722 extends A389721 {

  /** Construct the sequence. */
  public A389722() {
    super(Z.TWO);
  }
}
