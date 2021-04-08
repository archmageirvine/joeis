package irvine.oeis.a006;

import irvine.oeis.PartialSumSequence;

/**
 * A006414 Number of nonseparable toroidal tree-rooted maps with n + 2 edges and n + 1 vertices.
 * @author Sean A. Irvine
 */
public class A006414 extends PartialSumSequence {

  /** Construct the sequence. */
  public A006414() {
    super(new A006322());
  }
}
