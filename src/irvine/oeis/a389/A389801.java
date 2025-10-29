package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A387793 allocated for Mats Granvik.
 * @author Sean A. Irvine
 */
public class A389801 extends FilterSequence {

  /** Construct the sequence. */
  public A389801() {
    super(1, new A000040(), p -> new Z(p.toString(2) + p + p.toString(2)).isProbablePrime() && new Z(p + p.toString(2) + p).isProbablePrime());
  }
}

