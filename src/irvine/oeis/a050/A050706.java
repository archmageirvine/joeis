package irvine.oeis.a050;

/**
 * A050706 Composites c that reach a prime after 2 iterations of c-&gt; c+sum of prime factors of c.
 * @author Sean A. Irvine
 */
public class A050706 extends A050703 {

  @Override
  protected int iterations() {
    return 2;
  }
}
