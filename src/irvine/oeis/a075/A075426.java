package irvine.oeis.a075;

import irvine.oeis.InverseSequence;

/**
 * A075426 Smallest initial value k that reaches 1 in n steps when iterating the map m -&gt; rad(m)-1, where rad(m) is the squarefree kernel of m (A007947).
 * @author Sean A. Irvine
 */
public class A075426 extends InverseSequence {

  /** Construct the sequence. */
  public A075426() {
    super(0, new A075425(), 0);
  }
}
