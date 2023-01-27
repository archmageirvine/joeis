package irvine.oeis.a224;
// manually etalists/etaprod at 2023-01-25 13:34

import irvine.oeis.transform.EtaProductSequence;

/**
 * A224225 a(0)=1; thereafter a(n) = 2*s(n,1)-3*s(n,2)+4*s(n,4)+9*s(n,6)-36*s(n,12), where s(n,k) = sigma(n/k) if k divides n, otherwise 0.
 * Eta product <code>Williams # w24</code>
 * @author Georg Fischer
 */
public class A224225 extends EtaProductSequence {

  /** Construct the sequence. */
  public A224225() {
    super(0, "[6,6;4,4;2,2;12,-4;3,-2;1,-2]");
  }
}
