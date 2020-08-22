package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017528 (12n)^8.
 * @author Sean A. Irvine
 */
public class A017528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017528() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 429981696, 110075314176L, 2821109907456L, 28179280429056L, 167961600000000L, 722204136308736L, 2478758911082496L, 7213895789838336L});
  }
}
