package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a001.A001494;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A066808.
 * @author Sean A. Irvine
 */
public class A066812 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A066812() {
    super(1, new A001494(), Z.ONE::add);
  }
}

