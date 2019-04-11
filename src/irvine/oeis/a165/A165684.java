package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165684 Dimension of the space of Siegel cusp forms of genus 2 and dimension <code>2n</code> (associated with full modular group Gamma_2).
 * @author Sean A. Irvine
 */
public class A165684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165684() {
    super(new long[] {-1, 0, 1, 1, 0, 0, 1, -1, -2, -1, 1, 0, 0, 1, 1, 0}, new long[] {0, 0, 0, 0, 1, 1, 1, 2, 2, 3, 4, 5, 5, 7, 8, 9});
  }
}
