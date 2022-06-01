package irvine.oeis.a080;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A080340 First known infinite sequence containing no odd integer of the form 2^m+p (p prime).
 * @author Sean A. Irvine
 */
public class A080340 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080340() {
    super(new long[] {-1, 2}, new long[] {7629217, 18814027});
  }
}
