package irvine.oeis.a030;

/**
 * A030718 The second list after the following procedure: starting with a list [1] and an empty list, repeatedly add the distinct values already in the first list in ascending order to the second list and add the corresponding frequencies of those values to the first list.
 * @author Sean A. Irvine
 */
public class A030718 extends A030717 {

  @Override
  protected long select(final long a, final long b) {
    return b;
  }
}
