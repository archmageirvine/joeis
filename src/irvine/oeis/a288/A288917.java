package irvine.oeis.a288;
// manually

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A288917 Number of 6-cycles in the n X n queen graph.
 * @author Georg Fischer
 */
public class A288917 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A288917() {
    super(1, 
       "[0,-1, 0, 3, 2,-1,-5,-6,-1, 6, 11, 6,-4,-10,-10,-4, 6, 11, 6,-1,-6,-5,-1, 2, 3, 0,-1]", 
       "[0, 0, 976, 26414, 207136, 951750, 3190304, 8721576, 20615340, 43736788, 85332868, 155691014, 268995384, 444000894, 705336724, 1083967932, 1619250600, 2358809948, 3361809572, 4697700286, 6451359236, 8719953330, 11620829368, 15285494276, 19871396864]", 0);
  }
}
