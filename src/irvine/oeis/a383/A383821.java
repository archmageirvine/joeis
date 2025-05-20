package irvine.oeis.a383;

import irvine.oeis.UnionSequence;
import irvine.oeis.a030.A030985;
import irvine.oeis.a030.A030986;
import irvine.oeis.a067.A067275;

/**
 * A383821 3-automorphic numbers: positive integers k such that 3k^2 ends with k.
 * @author Sean A. Irvine
 */
public class A383821 extends UnionSequence {

  public A383821() {
    super(1, new A030985(), new A030986(), new A067275().skip(2));
  }
}

