package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016894 (5n+3)^10.
 * @author Sean A. Irvine
 */
public class A016894 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016894() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {59049, 1073741824, 137858491849L, 3570467226624L, 41426511213649L, 296196766695424L, 1531578985264449L, 6278211847988224L, 21611482313284249L, 64925062108545024L, 174887470365513049L});
  }
}
