package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Combiner;
import irvine.oeis.PrependSequence;
import irvine.oeis.a066.A066265;
import irvine.oeis.a220.A220262;

/**
 * A085770 Number of odd semiprimes &lt; 10^n. Number of terms of A046315 &lt; 10^n.
 * @author Sean A. Irvine
 */
public class A085770 extends PrependSequence {

  /** Construct the sequence. */
  public A085770() {
    super(0, new Combiner(0, new A066265(), new A220262(), Z::subtract).skip(2), 0, 1);
  }
}
