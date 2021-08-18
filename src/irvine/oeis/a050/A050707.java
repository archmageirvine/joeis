package irvine.oeis.a050;

/**
 * A050707 Composites c that reach a prime after 3 iterations of c -&gt; c + sum of prime factors of c.
 * @author Sean A. Irvine
 */
public class A050707 extends A050703 {

  @Override
  protected int iterations() {
    return 3;
  }
}
