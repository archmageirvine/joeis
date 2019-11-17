package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027640 Poincar&#233; series [or Poincare series] for ring of modular forms of genus 2.
 * @author Sean A. Irvine
 */
public class A027640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027640() {
    super(new long[] {-1, 0, 0, 0, 1, 1, 1, 0, 0, -1, -1, -1, 1, 0, 0, 1, -1, -1, -1, 0, 0, 1, 1, 1, 0, 0, 0},
      new long[] {1, 0, 1, 0, 1, 0, 2, 0, 3, 0, 2, 0, 4, 0, 4, 0, 5, 0, 6, 0, 8, 0, 7, 0, 10, 0, 11},
      1, 0, 0, 0);
  }
}
