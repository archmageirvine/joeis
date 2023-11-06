package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A066774 A066728(a(n))=3.
 * @author Sean A. Irvine
 */
public class A066774 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A066774() {
    super(1, new A066728(), Z.THREE::equals);
  }
}

