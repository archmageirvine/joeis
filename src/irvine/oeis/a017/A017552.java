package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017552 (12n+2)^8.
 * @author Sean A. Irvine
 */
public class A017552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017552() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {256, 1475789056, 208827064576L, 4347792138496L, 39062500000000L, 218340105584896L, 899194740203776L, 2992179271065856L, 8507630225817856L});
  }
}
