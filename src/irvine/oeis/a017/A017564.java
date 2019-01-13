package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017564.
 * @author Sean A. Irvine
 */
public class A017564 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017564() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {6561, 2562890625L, 282429536481L, 5352009260481L, 45767944570401L, 248155780267521L, 1001129150390625L, 3282116715437121L, 9227446944279201L});
  }
}
