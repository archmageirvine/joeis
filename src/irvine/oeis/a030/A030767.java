package irvine.oeis.a030;

/**
 * A030767 The first list after the following procedure: starting with a list [2] and an empty list, repeatedly add the distinct values already in both lists in descending order to the second list and add the corresponding frequencies of those values to the first list.
 * @author Sean A. Irvine
 */
public class A030767 extends A030757 {

  @Override
  protected long initialTerm() {
    return 2;
  }
}

