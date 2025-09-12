package irvine.oeis.a387;

import irvine.oeis.Combiner;
import irvine.oeis.a004.A004018;
import irvine.oeis.a005.A005875;

/**
 * A387658 allocated for Alex Klotz.
 * @author Sean A. Irvine
 */
public class A387658 extends Combiner {

  /** Construct the sequence. */
  public A387658() {
    super(0, new A004018(), new A005875(), ADD);
  }
}

