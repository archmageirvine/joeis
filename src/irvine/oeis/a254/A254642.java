package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254642 Third partial sums of eighth powers (A001016).
 * @author Sean A. Irvine
 */
public class A254642 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254642() {
    super(1, new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {1, 259, 7335, 86765, 629174, 3314178, 13906578, 49183590, 152191935, 422931613, 1075761505, 2540663307L});
  }
}
