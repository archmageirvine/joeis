package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017527 a(n) = (12n)^7.
 * @author Sean A. Irvine
 */
public class A017527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017527() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 35831808, 4586471424L, 78364164096L, 587068342272L, 2799360000000L, 10030613004288L, 29509034655744L});
  }
}
