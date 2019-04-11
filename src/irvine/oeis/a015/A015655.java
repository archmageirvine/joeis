package irvine.oeis.a015;

/**
 * A015655 Number of ordered 5-tuples of integers from <code>[ 2,n ]</code> with no common factors among quadruples.
 * @author Sean A. Irvine
 */
public class A015655 extends A015653 {

  @Override
  protected long start() {
    return 2;
  }
}
