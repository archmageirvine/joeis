package irvine.oeis.a112;

import irvine.oeis.PrependSequence;
import irvine.oeis.a260.A260878;

/**
 * A112849 Number of congruence classes (epimorphisms/vertex partitionings induced by graph endomorphisms) of undirected cycles of even length: |C(C_{2*n})|.
 * @author Georg Fischer
 */
public class A112849 extends PrependSequence {

  /** Construct the sequence. */
  public A112849() {
    super(new A260878().skip(2), 1);
  }
}
