package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017026 a(n) = (7*n + 3)^10.
 * @author Sean A. Irvine
 */
public class A017026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017026() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {59049, 10000000000L, 2015993900449L, 63403380965376L, 819628286980801L, 6278211847988224L, 34050628916015625L, 144555105949057024L, 511116753300641401L, 1568336880910795776L, 4297625829703557649L});
  }
}
