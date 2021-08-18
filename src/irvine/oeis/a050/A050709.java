package irvine.oeis.a050;

/**
 * A050709 Composites c that reach a prime after 5 iterations of c-&gt; c+sum of prime factors of c.
 * @author Sean A. Irvine
 */
public class A050709 extends A050703 {

  @Override
  protected int iterations() {
    return 5;
  }
}
