package irvine.oeis.a048;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a003.A003188;

/**
 * A048642 Partial products of A003188 (Gray code).
 * @author Sean A. Irvine
 */
public class A048642 extends PartialProductSequence {

  /** Construct the sequence. */
  public A048642() {
    super(new PrependSequence(new SkipSequence(new A003188(), 1), 1));
  }
}

