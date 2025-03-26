package irvine.oeis.a076;

import irvine.oeis.Combiner;
import irvine.oeis.a067.A067535;
import irvine.oeis.a070.A070321;

/**
 * A076260 a(n) = 0 if n is a squarefree number, otherwise the distance between the two nearest squarefree numbers around n: A067535(n)-A070321(n).
 * @author Sean A. Irvine
 */
public class A076260 extends Combiner {

  /** Construct the sequence. */
  public A076260() {
    super(1, new A067535(), new A070321(), SUBTRACT);
  }
}
