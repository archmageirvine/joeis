package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A066317 Number of rooted identity (asymmetric) planar trees that can be turned over.
 * @author Sean A. Irvine
 */
public class A066317 extends PrependSequence {

  /** Construct the sequence. */
  public A066317() {
    super(1, new SimpleTransformSequence(new A066316(), Z.ONE::add), 1, 1, 1, 1);
  }
}

