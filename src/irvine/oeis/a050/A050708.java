package irvine.oeis.a050;

/**
 * A050708 Composites c that reach a prime after 4 iterations of c-&gt; c+sum of prime factors of c.
 * @author Sean A. Irvine
 */
public class A050708 extends A050703 {

  @Override
  protected int iterations() {
    return 4;
  }
}
