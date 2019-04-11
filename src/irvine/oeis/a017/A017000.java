package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017000 <code>a(n) = (7*n + 1)^8</code>.
 * @author Sean A. Irvine
 */
public class A017000 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017000() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 16777216, 2562890625L, 54875873536L, 500246412961L, 2821109907456L, 11688200277601L, 39062500000000L, 111429157112001L});
  }
}
