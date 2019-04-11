package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017514 <code>a(n) = (11*n + 10)^6</code>.
 * @author Sean A. Irvine
 */
public class A017514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017514() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1000000, 85766121, 1073741824, 6321363049L, 24794911296L, 75418890625L, 192699928576L});
  }
}
