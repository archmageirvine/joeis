package irvine.oeis.a002;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.util.io.IOUtils;

/**
 * A002205 The RAND Corporation list of a million random digits.
 * @author Sean A. Irvine
 */
public class A002205 extends FiniteSequence {

  private static ArrayList<Z> read() {
    final ArrayList<Z> res = new ArrayList<>();
    try (final BufferedReader mS = IOUtils.reader("irvine/oeis/a002/a002205.dat.gz")) {
      String line;
      while ((line = mS.readLine()) != null) {
        if (!line.isEmpty()) {
          res.add(new Z(line));
        }
      }
    } catch (final IOException e) {
      // Should not happen
      throw new RuntimeException(e);
    }
    return res;
  }

  /** Construct the sequence. */
  public A002205() {
    super(read());
  }
}
