package irvine.oeis.a046;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000578;
import irvine.oeis.a003.A003072;
import irvine.oeis.a003.A003325;
import irvine.oeis.a003.A003327;
import irvine.oeis.a003.A003328;
import irvine.oeis.a003.A003329;

/**
 * A046040 Numbers that are the sum of 6 but no fewer positive cubes.
 * @author Sean A. Irvine
 */
public class A046040 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A046040() {
    super(new A003329(), UnionSequence.createUnion(new A003328(), new A003327(), new A003072(), new A003325(), new A000578()));
  }
}  
