package irvine.oeis.a071;

/**
 * A071653 Permutation of natural numbers induced by reranking plane binary trees given in the standard lexicographic order (A014486) with an "arithmetic global ranking algorithm", using the bivariate form of A001477 as the packing bijection N x N -&gt; N.
 * @author Sean A. Irvine
 */
public class A071653 extends A071651 {

  /** Construct the sequence. */
  public A071653() {
    super((x, y) -> x.add(y).square().add(y.multiply(3)).add(x).divide2());
  }
}
