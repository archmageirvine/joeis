package irvine.oeis.a052;

/**
 * A052029 Primes base 10 that remain primes in five bases b, 2&lt;=b&lt;=10, expansions interpreted as decimal numbers.
 * @author Sean A. Irvine
 */
public class A052029 extends A052027 {

  @Override
  protected int target() {
    return 5;
  }
}
