package irvine.oeis.a048;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a003.A003188;

/**
 * A048642 Partial products of A003188 (Gray code).
 * @author Sean A. Irvine
 */
public class A048642 extends PartialProductSequence {

  /** Construct the sequence. */
  public A048642() {
    super(new PrependSequence(new A003188().skip(1), 1));
  }
}

