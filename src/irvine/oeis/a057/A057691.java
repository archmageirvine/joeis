package irvine.oeis.a057;

/**
 * A057691 Number of terms before entering cycle in trajectory of P under the 'Px+1' map, where P = n-th prime, or -1 if trajectory does not cycle.
 * @author Sean A. Irvine
 */
public class A057691 extends A057690 {

  @Override
  protected long select(final long cnt, final long seen) {
    return seen - cnt;
  }
}
