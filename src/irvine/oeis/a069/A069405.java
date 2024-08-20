package irvine.oeis.a069;

import java.util.ArrayList;
import java.util.List;

/**
 * A069405 Half the number of n X 5 binary arrays with a path of adjacent 1's and a path of adjacent 0's from top row to bottom row.
 * @author Sean A. Irvine
 */
public class A069405 extends A069404 {

  @Override
  protected List<String> buildStates() {
    final ArrayList<String> allowedStates = new ArrayList<>();
    for (final char a : BITS) {
      for (final char b : BITS) {
        for (final char c : BITS) {
          for (final char d : BITS) {
            for (final char e : BITS) {
              final String s = String.valueOf(a) + b + c + d + e;
              if (isValidState(s)) {
                allowedStates.add(s);
              }
            }
          }
        }
      }
    }
    return allowedStates;
  }
}

