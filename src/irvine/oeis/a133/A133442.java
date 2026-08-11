package irvine.oeis.a133;

import irvine.oeis.base.MorphismFixedPointSequence;

/**
 * A133442 A geometrical graph substitution of a tess-tetrahedron embedded in a cube as an eight-"tone" all-naturals musical scale such that here the connections can be cut to isolate the tetrahedra.
 * @author Sean A. Irvine
 */
public class A133442 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A133442() {
    super(1, "1", "3", "1->368,2->457,3->168,4->257,5->247,6->138,7->245,8->136");
  }
}

