package irvine.oeis.a030;

/**
 * A030747 The first list after the following procedure: starting with a list [4] and an empty list, repeatedly add the distinct values already in both lists in ascending order to the second list and add the corresponding frequencies of those values to the first list.
 * @author Sean A. Irvine
 */
public class A030747 extends A030707 {

  @Override
  protected long initialTerm() {
    return 4;
  }
}

