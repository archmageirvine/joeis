package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a035.A035519;

/**
 * A059755 Odd rare numbers: odd n such that n-r and n+r are squares, where r is the reverse of n.
 * @author Sean A. Irvine
 */
public class A059755 extends FilterSequence {

  /** Construct the sequence. */
  public A059755() {
    super(new A035519(), Z::isOdd);
  }
}
