package irvine.math.expression;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * Expression evaluator.
 * @author Sean A. Irvine
 */
public final class Sircon {

  private Sircon() { }

  /**
   * Construct the given expression.
   * @param expression expression to evaluate
   * @return value of expression
   */
  public static Expression parse(final String expression) {
    final ANTLRInputStream input = new ANTLRInputStream(expression);
    //final CharStream input = CharStreams.fromString(expression); // needed for 4.7.2 -- but 4.7.2 breaks other things
    final GrammarLexer lexer = new GrammarLexer(input);
    final CommonTokenStream tokens = new CommonTokenStream(lexer);
    final GrammarParser parser = new GrammarParser(tokens);
    parser.setBuildParseTree(true);
    final GrammarParser.ExprContext tree = parser.expr();
    //tree.inspect(parser); // show in gui
    //System.out.println(tree.toStringTree(parser));
    return tree.v;
  }

  /**
   * Parse an integer expression.
   * @param args ignored
   */
  public static void main(final String[] args) {
    for (final String a : args) {
      System.out.println(parse(a).eval());
    }
  }

}
