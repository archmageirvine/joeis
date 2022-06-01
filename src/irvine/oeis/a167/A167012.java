package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167012 Number of Level 2 hexagonal polyominoes with cheesy blocks and n cells.
 * @author Sean A. Irvine
 */
public class A167012 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167012() {
    super(new long[] {-34, 70, -42, 222, -404, 158, -7, 268, -446, 672, -1081, 913, -159, -317, 266, 169, -797, 1108, -850, 391, -107, 16}, new long[] {1, 3, 11, 44, 186, 810, 3582, 15952, 71242, 318441, 1423411, 6360809, 28415254, 126900911, 566604462, 2529439891L, 11290673434L, 50394458326L, 224918228462L, 1003813933351L, 4479953995624L, 19993503244811L});
  }
}
