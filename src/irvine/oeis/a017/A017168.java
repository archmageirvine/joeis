package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017168 <code>a(n) = (9*n)^8</code>.
 * @author Sean A. Irvine
 */
public class A017168 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017168() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 43046721, 11019960576L, 282429536481L, 2821109907456L, 16815125390625L, 72301961339136L, 248155780267521L, 722204136308736L});
  }
}
